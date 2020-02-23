package CollectionExamples;
import java.lang.*;
import java.util.TreeMap;

public class TreemapWithClass {

	public static void main(String[] args) {
		

		TreeMap<LibraryTree, StudentTree> tm = new TreeMap<>();
		
		LibraryTree l = new LibraryTree();
		StudentTree s = new StudentTree();
		l.libnum=1;
		l.totalbooks=2;
		s.name="Nishu";
		s.semester=1;
		tm.put(l,s);
		LibraryTree l2 = new LibraryTree();
		StudentTree s2 = new StudentTree();
		l2.libnum=2;
		l2.totalbooks=20;
		s2.name="Nihira";
		s2.semester=1;
		tm.put(l2,s2);
		LibraryTree l3 = new LibraryTree();
		StudentTree s3 = new StudentTree();
		l3.libnum=2;
		l3.totalbooks=20;
		s3.name="Nihira";
		s3.semester=2;
		tm.put(l3,s3);
		LibraryTree l4 = new LibraryTree();
		StudentTree s4 = new StudentTree();
		l4.libnum=2;
		l4.totalbooks=20;
		s4.name="Sony";
		s4.semester=2;
		tm.put(l4,s4);
		LibraryTree l5 = new LibraryTree();
		StudentTree s5 = new StudentTree();
		l5.libnum=2;
		l5.totalbooks=20;
		s5.name="Minnie";
		s5.semester=1;
		tm.put(l5,s5);
		
		System.out.println(tm);
		}	

			
		}
		
		
		
		
		
	


