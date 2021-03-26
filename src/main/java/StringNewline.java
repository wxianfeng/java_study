/**
 * Created by haomiao on 2017/07/03.
 */
public class StringNewline {
    public static void main(String[] args) {
        String policy = "{\n" +
            "    \"Version\": \"1\", \n" +
            "    \"Statement\": [\n" +
            "        {\n" +
            "            \"Action\": \"cloudphoto:*\", \n" +
            "            \"Resource\": \"*\" ,\n" +
            "            \"Condition\":  { \n" +
            "               \"Bool\":  {\n" +
            "               \"acs:MFAPresent\": true\n" +
            "                          }\n" +
            "                            },\n" +
            "            \"Effect\": \"Allow\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

        String policy1 = "{\n" +
            "    \"Version\": \"1\", \n" +
            "    \"Statement\": [\n" +
            "        {\n" +
            "            \"Action\": \"cloudphoto:*\", \n" +
            "            \"Resource\": *\" , \n" +
            "            \"Effect\": \"Allow\" , \n" +
            "\"Condition\": {\n "+
            "\"DateLessThan\": {\n" +
            "\"acs:CurrentTime\": \"2015-06-11T17:00:00+08:00\"\n" +
            "}\n" +
            "}\n" +
            "        }\n" +
            "    ]\n" +
            "}";

        //System.out.println(policy);

        System.out.println(policy1);
    }
}
