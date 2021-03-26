package com.wxianfeng.open.security;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by haomiao on 5/16/17.
 *
 * @author haomiao
 * @date 2017/05/16
 */
public class SymmetricalCoder
{
    public static final String ALGORITHM_DES = "DES";
    public static final String ALGORITHM_DESede = "DESede";
    public static final String ALGORITHM_AES = "AES";
    public static final String ALGORITHM_Blowfish = "Blowfish";
    public static final String ALGORITHM_RC2 = "RC2";
    public static final String ALGORITHM_RC4 = "RC4";

    private Key toKey(String algorithm, byte[] key) throws InvalidKeyException,
        InvalidKeySpecException, NoSuchAlgorithmException
    {
        if (ALGORITHM_DES.equals(algorithm))
        {
            DESKeySpec dks = new DESKeySpec(key);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(algorithm);
            SecretKey secretKey = keyFactory.generateSecret(dks);
            return secretKey;
        }

        return new SecretKeySpec(key, algorithm);
    }

    /**
     * 解密
     *
     * @param algorithm
     * @param data
     * @param key
     * @return
     * @throws InvalidKeyException
     * @throws InvalidKeySpecException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchPaddingException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public byte[] decrypt(String algorithm, byte[] data, byte[] key)
        throws InvalidKeyException, InvalidKeySpecException,
        NoSuchAlgorithmException, NoSuchPaddingException,
        IllegalBlockSizeException, BadPaddingException
    {
        Key k = toKey(algorithm, key);

        Cipher cipher = Cipher.getInstance(algorithm.toString());
        cipher.init(2, k);

        return cipher.doFinal(data);
    }

    /**
     * 加密
     *
     * @param algorithm
     * @param data
     * @param key
     * @return
     * @throws InvalidKeyException
     * @throws InvalidKeySpecException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchPaddingException
     * @throws IllegalBlockSizeException
     * @throws GeneralSecurityException
     */
    public byte[] encrypt(String algorithm, byte[] data, byte[] key)
        throws InvalidKeyException, InvalidKeySpecException,
        NoSuchAlgorithmException, NoSuchPaddingException,
        IllegalBlockSizeException, GeneralSecurityException
    {
        Key k = toKey(algorithm, key);
        Cipher cipher = Cipher.getInstance(algorithm.toString());
        cipher.init(1, k);

        return cipher.doFinal(data);
    }

    /**
     * 初始化密钥
     *
     * @param algorithm
     * @return
     * @throws NoSuchAlgorithmException
     */
    public byte[] initKey(String algorithm) throws NoSuchAlgorithmException
    {
        return initKey(algorithm, null);
    }

    /**
     * 初始化密钥
     *
     * @param algorithm
     * @param seed
     * @return
     * @throws NoSuchAlgorithmException
     */
    public byte[] initKey(String algorithm, byte[] seed)
        throws NoSuchAlgorithmException
    {
        SecureRandom secureRandom = null;

        if (seed != null)
        {
            secureRandom = new SecureRandom(seed);
        }
        else
        {
            secureRandom = new SecureRandom();
        }

        KeyGenerator kg = KeyGenerator.getInstance(algorithm.toString());
        kg.init(secureRandom);

        return kg.generateKey().getEncoded();
    }

    public static void main(String[] args) throws Exception
    {
        // String algorithm = ALGORITHM_RC4;
        //String algorithm = ALGORITHM_Blowfish;
        String algorithm = ALGORITHM_AES;
        byte[] data = "appKey||outerId||tokenCreateTime||tokenExireTime||Action1,Action2".getBytes();
        SymmetricalCoder coder = new SymmetricalCoder();
        byte[] key = coder.initKey(algorithm, "298339db52faccd36594b10859c0c86b298339db52faccd36594b10859c0c86b".getBytes());
        byte[] result = coder.encrypt(algorithm, data, key);
        System.out.println(new String(coder.decrypt(algorithm, result, key)));
    }
}