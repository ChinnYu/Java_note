package com.jason;

public class BinaryTree {
	
	private Node root;
	
	//添加節點
	public void add(int data) {
		if(root==null) {
			root = new Node(data);
		}else {
			root.addNode(data);
		}
	}
	//輸出
	public void print() {
		root.printNode();
	}
	
	private class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
		
		public void addNode(int data) {
			if(this.data>data) {
				if(this.left==null) {
					this.left = new Node(data);
				}else {
					this.left.addNode(data);
				}
			}else {
				if(this.right==null) {
					this.right = new Node(data);
				}else {
					this.right.addNode(data);
				}
			}
		}
		//中序遍歷
		public void printNode() {
			if(this.left!=null) {
				this.left.printNode();
			}
			System.out.print(this.data+"->");
			if(this.right!=null) {
				this.right.printNode();
			}
		}
	}
}
