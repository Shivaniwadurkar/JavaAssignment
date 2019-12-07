package com.assignment;

public class NodeData {
	public void printList(Node head) {
		
		Node Current = head;
		while(Current != null) {
			System.out.println(Current.getData());
			Current = Current.getNext();
		}
	}
	
public void printConsecutiveList(Node head) {
		
		Node Current = head;
		while(Current != null) {
			System.out.println(Current.getData());
			Current = Current.getNext();
			if(Current != null) {
			Current = Current.getNext();
			}
		}
	}
}
