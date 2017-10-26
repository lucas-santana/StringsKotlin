import java.io.File
import java.io.InputStream


fun main(args: Array<String>) {
	
	val bufferedReader = File("src\\kot.txt").bufferedReader()
    val lineList = mutableListOf<String>()
	
	var file = File("src\\kot2.txt")
	
    bufferedReader.useLines {
		lines -> lines.forEach {
			lineList.add(it)
		}
	}	
    lineList.forEach {
		println(it)
		
	}
	    lineList.forEach {
		
		var stringChar = it.toCharArray()
		stringChar.reverse()
		println(stringChar)
		//file.printWriter().use { out -> out.println("sharinha")}
			var y =stringChar.toString()
			
		file.appendText(y)
		

	}
	    
	
	/*
	var stringChar = inputString.toCharArray()
	 it.reverse()
	print(stringChar)
		
	val inputStream: InputStream = File("E:\\\\linguagem\\kot.txt").inputStream()

	val inputString = inputStream.bufferedReader().use {
		 it.readText()
	}
    
	println(inputString)
	
	var stringChar = inputString.toCharArray()
	
	 stringChar.reverse()
	print(stringChar)*/
}