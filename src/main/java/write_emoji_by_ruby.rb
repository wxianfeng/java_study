require "iconv"

emoji = "😭"

# 方式 1, 直接写到文件 UTF-16BE 编码
# File.open("emoji.out", "w", encoding: 'UTF-16BE') { |f|
#   f.write(emoji)
# }

# 方式 2, 写到文件 ASCII-8BIT 编码, 存的时候把 utf-8 转为 utf-16
iconv16 = Iconv.new("UTF-16BE", "UTF-8")

File.open("emoji.out", "w", encoding: 'ASCII-8BIT') { |f|
  # f.write(emoji)
  f.write iconv16.iconv(emoji)
}
