package com.assignment;

public class Node {
	private Node next;
    private int data;
    public Node(int data) {
    	this.data = data;
    }
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
    
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node b = new Node(2);
		head.setNext(b);
		
		Node c = new Node(3);
		b.setNext(c);
		
		Node d = new Node(4);
		c.setNext(d);
		
		Node e = new Node(5);
		d.setNext(e);
		
		NodeData obj = new NodeData();
		obj.printList(head);
		System.out.println("----------");
		obj.printConsecutiveList(head);
	}


    
}
