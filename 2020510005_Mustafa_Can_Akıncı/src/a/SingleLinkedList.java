package a;

public class SingleLinkedList {
	public Node head = null;
	public Node tail = null;
	
	public void add(Object data) {
		if(head==null) {
			Node newNode = new Node(data);                   
			head = newNode;
			tail = newNode;
		}
		else  {           
			Node newnode = new Node(data);
			newnode.setLink(head);
			head = newnode;
		}
	}
	public void delete(Object dataToDelete) {
		if(size()==1) {
			head = null;
			return;
		}
		while((Integer)head.getData()==(Integer)dataToDelete)
			head = head.getLink();
		Node temp = head;
		Node previous = null;
		while(temp != null) {
			if((Integer)temp.getData()==(Integer)dataToDelete) {
				previous.setLink(temp.getLink());
				temp=previous;
				return;
			}
			previous = temp;
			temp = temp.getLink();
			
		}
	}
	public boolean search(Object item) {
        boolean flag = false;
        if(head == null)
            System.out.print("Linked list empty.");
        else {
            Node temp = head;
            while(temp != null) {
                if(item == temp.getData()) 
                    flag = true;
                temp = temp.getLink();
            }
        }
        return flag;
    }
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		while(current != null) {
			System.out.print(current.getData()+" ");
			current = current.getLink();
		}
	}
	
	public int size() {
		int count = 0;
		if(head == null) {
			System.out.println("Linked list is empty.");
		}
		else {
			Node temp = head;
			while(temp != null){
				count++;
				temp=temp.getLink();
			}
		}
		return count;
	}
	public boolean orderednumber() {                
        if(search(1)&&search(2)&&search(3)&&search(4)&&search(5)&&search(6)) {return true;}
        else {return false;}
    }
	public int countnumber(Object e) {         
        Node current = head;
        int count = 0;
        for(int i = 0; i < size(); i++) {
            if(e == current.getData()) {
                count++;
            }
            current = current.getLink();
        }
        return count;
    }
	
	
    public void addsorted(Object data) {

        if(head==null) {
            Node newNode = new Node(data);                   // adding first element
            head = newNode;
            tail = newNode;
        }
        else if(Integer.parseInt(data.toString().split(" ")[1]) < Integer.parseInt(head.getData().toString().split(" ")[1])) {           // adding to front node the first element
            Node newnode = new Node(data);
            newnode.setLink(head);
            head = newnode;
        }
        else {
            Node temp = head;
            Node previous = null;
            // split names and scores and sort them according to their scores
            while(temp!=null && Integer.parseInt(data.toString().split(" ")[1]) > Integer.parseInt(temp.getData().toString().split(" ")[1])) {
                previous = temp;
                temp=temp.getLink();
            }
            if(temp==null){                                     // adding to last 
                Node newnode = new Node(data);
                previous.setLink(newnode);
            }
            else {                                              // adding between two nodes
                Node newnode = new Node(data);
                newnode.setLink(temp);
                previous.setLink(newnode);
            }
        }
    }

	
	
	



}
		



