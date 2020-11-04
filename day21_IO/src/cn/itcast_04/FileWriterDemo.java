package cn.itcast_04;
/**
 *   由于转换流名称太长，Java提供了其子类供我们使用
 * 			Class FileWriter
 * 		FileWriter(String fileName)
		Constructs a FileWriter object given a file name.
		
		FileWriter(File file)
		Constructs a FileWriter object given a File object.
		
		方法继承自Class OutputStreamWriter
		void	write(int c)
				Writes a single character.    注意传入int 型，写一个字符
				
		void	write(String str, int off, int len)
				Writes a portion of a string.            写一个字符串
				
		void	write(char[] cbuf, int off, int len)
				Writes a portion of an array of characters.    写一个字符数组的一部分
		void	flush()
				Flushes the stream.
 *
 */
public class FileWriterDemo {

}
