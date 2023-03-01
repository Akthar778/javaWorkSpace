package blockpackage2;

import blocks.block1; import blocks.block2;

public class packageAccess {
public static void main(String[] args) {
	packageAccess obj = new packageAccess();
	block1 obj2= new block1();
	blocks.block1 obj3= new  blocks.block1();
	System.out.println(obj.cc);
	
}
}
