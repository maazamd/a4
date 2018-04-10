import java.util.Iterator;
public class ITIStringBuffer {
	
	private SinglyLinkedList<Character> alpha;
	private char[] beta;
	
    public ITIStringBuffer() {
        //throw new UnsupportedOperationException( "replace with your implementation" );
		alpha = new SinglyLinkedList<Character>();
    }

    public ITIStringBuffer(String  firstString){
        //throw new UnsupportedOperationException( "replace with your implementation" );
		beta = firstString.toCharArray();
		alpha = new SinglyLinkedList<Character>();
		alpha.addFirst(beta[0]);
		for (int i = 1; i < beta.length; i++) {
			alpha.add(beta[i]);
		}
    }

    public void append(String nextString){
        //throw new UnsupportedOperationException( "replace with your implementation" );
		beta = nextString.toCharArray();
		if (alpha.isEmpty()) {
			alpha.addFirst(beta[0]);
			for (int i = 1; i < beta.length; i++) {
				alpha.add(beta[i]);
			}
		}
		else {
			for (int i = 0; i < beta.length; i++) {
				alpha.add(beta[i]);
			}
		}
    }

    public String toString(){
        //throw new UnsupportedOperationException( "replace with your implementation" );
		int counter = 0;
		char[] gamma = new char[alpha.size()];
		Iterator<Character> itr = alpha.iterator();
		while (itr.hasNext()) {
		   char element = itr.next();
		   gamma[counter] = element;
		   counter++;
		}
		String delta = new String(gamma);
		return delta;
    }

}