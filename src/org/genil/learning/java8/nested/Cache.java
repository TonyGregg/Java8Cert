package org.genil.learning.java8.nested;

interface CacheIterator {
    boolean hasNext();
    BookMark next();
}

public class Cache {		
	private BookMark[] items;	
	private int next = 0;
	
	public Cache(int size) { 
    	items = new BookMark[size]; 
    }
    
    public void add(BookMark item) {
	    if(next < items.length)
            items[next++] = item;
    }
    
    public CacheIterator iterator() {
    	return new MyCacheIterator();    	
    }

    public void go() {
		System.out.println("outer go . .");
	}
    
    private class MyCacheIterator implements CacheIterator {
    	private int i = 0;
    	
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < items.length;
		}

		public void go() {
			System.out.println("inner go. . .");
		}

		@Override
		public BookMark next() {
			// TODO Auto-generated method stub
			go();

			return items[i++];
		}

//		public static void test() {
//			System.out.println("Hello !! hell... no statics are allowed from if the inner class is not static");
//		}
    	
    }
    
    public static void main(String[] args) {
		Cache recommendedItems = new Cache(5);
		
		BookMark item1 = new BookMark();
		item1.setId(2000);
		item1.setTitle("Use Final Liberally");
				
		BookMark item2 = new BookMark();
		item2.setId(2001);
		item2.setTitle("How do I import a pre-existing Java project into Eclipse and get up and running?");
				
		BookMark item3 = new BookMark();
		item3.setId(2002);
		item3.setTitle("Interface vs Abstract Class");
				
		BookMark item4 = new BookMark();
		item4.setId(2003);
		item4.setTitle("NIO tutorial by Greg Travis");
				
		BookMark item5 = new BookMark();
		item5.setId(2004);
		item5.setTitle("Virtual Hosting and Tomcat");
				
		recommendedItems.add(item1);
		recommendedItems.add(item2);
		recommendedItems.add(item3);
		recommendedItems.add(item4);
		recommendedItems.add(item5);
		
		CacheIterator iterator = recommendedItems.iterator();
		//CacheIterator iterator = recommendedItems.new MyCacheIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}	

	}
    
}
