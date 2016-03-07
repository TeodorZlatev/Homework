package Task5;

import java.util.NoSuchElementException;

public class SingleLinkedList<T> {
	static class Item<T> {
		private T data;
		private Item<T> next;

		public Item(T data) {
			this(data, null);
		}

		public Item(T data, Item<T> next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Item<T> getNext() {
			return next;
		}

		public void setNext(Item<T> next) {
			this.next = next;
		}
	}

	Item<T> head;
	int length;

	public SingleLinkedList() {
		this.length = 0;
	}

	public void addLast(T data) {
		if (head == null) {
			head = new Item<T>(data);
			length++;
			return;
		}
		Item<T> currentItem = head;
		while (currentItem.getNext() != null) {
			currentItem = currentItem.getNext();
		}
		currentItem.setNext(new Item<T>(data));
		length++;
	}

	public T getAt(int index) throws ArrayIndexOutOfBoundsException {
		if (length == 0 || length < index) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		Item<T> itemAt = head;

		for (int i = 0; i < index; i++) {
			itemAt = itemAt.getNext();
		}
		return itemAt.getData(); 
	}

	public T removeLast() throws NoSuchElementException {
		T ret = null;
		if (length == 0) {
			throw new NoSuchElementException();
		}
		System.out.print("Премахнат е елемент: ");
		if (length == 1) {
			ret = head.getData(); //защо иска cast
			head = null;
			return ret;
		}

		Item<T> currentItem = head;
		Item<T> previousItem = null;
		while (currentItem.getNext() != null) {
			previousItem = currentItem;
			currentItem = currentItem.getNext();
		}

		ret = currentItem.getData(); 
		currentItem = null;
		previousItem.setNext(currentItem);
		length--;
		return ret;

	}

	public void printAll() {
		Item<T> currentItem = head;
		while (currentItem.getNext() != null) {
			System.out.println("Current item data: " + currentItem.getData());
			currentItem = currentItem.getNext();
		}
		System.out.println("Current item data: " + currentItem.getData());
	}

}
