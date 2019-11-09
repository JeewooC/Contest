package datastructures.lists;

import java.util.*;

public class JWCArrayList<E> implements List<E> {

    private Object[] list;
    private int size;

    // constructors
    public JWCArrayList () {
        list = new Object[10];
    }

    public JWCArrayList (int length) {
        list = new Object[length];
    }

    public JWCArrayList (Collection c) {
        list = c.toArray();
    }

    // call when need to expand space
    private void expand() {
        list = Arrays.copyOf(list, list.length + list.length/2);
    }

    @Override
    public boolean add(Object o) {
        int i = 0;
        for (; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = o;
                return true;
            }
        }
        expand();
        list[i] = o;
        return false;
    }

    @Override
    public int size() {
        int i = 0;
        for (; i <list.length; i++) {
            if (list[i] == null) {
                return i;
            }
        }
        return i;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= list.length || list[index] == null) {
            throw new IndexOutOfBoundsException("");
        }
        return (E) list[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        Object removedObject = list[index];
        Object[] front = Arrays.copyOfRange(list, 0, index);
        Object[] back = Arrays.copyOfRange(list, index+1, list.length);
        list = new Object[front.length + back.length];
        System.arraycopy(front, 0, list, 0, front.length);
        System.arraycopy(back, 0, list, front.length, back.length);

        return (E) removedObject;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (list[0] == null) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        JWCArrayList<Integer> arrayList = new JWCArrayList<>(2);
        System.out.println(arrayList.size()); // 0
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(1000);
        System.out.println(arrayList.size()); // 4
        System.out.println(arrayList.get(1)); // 5
        arrayList.remove(1);
        System.out.println(arrayList.size()); // 3
        System.out.println(arrayList.get(1)); // 4
    }

}
