---


---

<blockquote>
<p>使用Scanner类进控制台或者文件输入操作</p>
</blockquote>
<pre><code>Scannner中的几个函数：
nextLine():读取一行的内容，包括空格，换行
nextInt():读取一个整型内容
nexDouble():读取一个双精度的浮点数
next():读取下一个内容，无论什么类型，其中遇到空格和换行默认是一个标记（即是跳过）和nextLine()类似
hasNext():用来判断文件中的还有下一个内容，无论什么类型的
hasNextInt()
hasNextDouble()://相似
</code></pre>
<h1 id="next（）、nextline-、hasnextline、-hasnext使用">next（）、nextLine() 、hasNextLine()、 hasNext()使用</h1>
<p>Scanner类的使用说明https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html；<br>
使用注意事项</p>
<ul>
<li>
<p>1、读取时候默认以空格来分割字符。如果以及被修改了，可以使用reset()方法来重置输入分隔符为空格；</p>
</li>
<li>
<p>2、nextInt[String][float]<a href="">Double</a>，读取完数据之后光标放在读取数据后面，同一行；</p>
</li>
<li>
<p>3、 next():只读取使用空格分开的字符，不能读取被空格分开的两个单词（也就是不能读取空格）读取完数据之后光标放在读取数据后面，同一行；</p>
</li>
<li>
<p>4、 nextLine():读取整行的数据包括单词间的空格，到回车结束（也就是从开始读一整行包括回车），读取结束后，光标放在下一行开头。</p>
</li>
<li>
<p>5、 nextInt()  nextLine()混合使用读取出错<br>
这种情况一般为做算法题时候输入数据给出多少行，然后按照行来读取数据。会出现问题为最后一行无法读取。<br>
解决办法为在nextInt之后加一个nextLine() 来读取掉本行的\n，后面就可以正常的读取数据了。</p>
</li>
<li>
<p>6、 使用while() 循环读取数据</p>
</li>
</ul>
<pre><code>public static void main(String[] args){  
    Scanner in=new Scanner(System.in);  
/**  
 * boolean hasNext(String p) * 停止条件：如果默认成参数p为空的话就会一直返回false，定义了参数p之后如果匹配到参数p返回true  
 */ 
 while (!in.hasNext("exit")){//读取到exit后直接跳出循环  
  System.out.println(in.nextLine());  
    }  
    in.nextLine();  
    System.out.println("------------");  
/**  
 * boolean hasNextLine() 
 * *停止条件：读取到文件结束符号EOF返回false，否则返回true  
 * 一般使用于文件读取  
  */  
  try {  
        Scanner fileIn=new Scanner(new File("/home/cai/temp/cai.txt"));  
        while (fileIn.hasNextLine()){  
            System.out.println(fileIn.nextLine());  
        }  
    } catch (FileNotFoundException e) {  
        e.printStackTrace();  
    }  
  
}
</code></pre>
<blockquote>
<p>目前无法解决未知输入行数下不使用终结符号来读取并自动停止，只能在<strong>while循环下输入特定的结束符号</strong>或者<strong>提前读取行数来for循环输入</strong>来终结读取行</p>
</blockquote>
<h1 id="数据读取">数据读取</h1>
<p>通过构造函数获取输入流<br>
Scanner(Constructor)</p>

<table>
<thead>
<tr>
<th>Constructor</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>Scanner(File source)</td>
<td>读取一个文件内容</td>
</tr>
<tr>
<td>Scanner(File source, String charsetName)</td>
<td>Constructs a new Scanner that produces values scanned from the specified file.</td>
</tr>
<tr>
<td>Scanner(InputStream source)</td>
<td>Constructs a new Scanner that produces values scanned from the specified input stream.</td>
</tr>
<tr>
<td>Scanner(InputStream source, String charsetName)</td>
<td>Constructs a new Scanner that produces values scanned from the specified input stream.</td>
</tr>
<tr>
<td>Scanner(Path source)</td>
<td>Constructs a new Scanner that produces values scanned from the specified file.</td>
</tr>
<tr>
<td>Scanner(Path source, String charsetName)</td>
<td>Constructs a new Scanner that produces values scanned from the specified file.</td>
</tr>
<tr>
<td>Scanner(Readable source)</td>
<td>Constructs a new Scanner that produces values scanned from the specified source.</td>
</tr>
<tr>
<td>Scanner(ReadableByteChannel source)</td>
<td>Constructs a new Scanner that produces values scanned from the specified channel.</td>
</tr>
<tr>
<td>Scanner(ReadableByteChannel source, String charsetName)</td>
<td>Constructs a new Scanner that produces values scanned from the specified channel.</td>
</tr>
<tr>
<td>Scanner(String source)</td>
<td>Constructs a new Scanner that produces values scanned from the specified string.</td>
</tr>
</tbody>
</table>
