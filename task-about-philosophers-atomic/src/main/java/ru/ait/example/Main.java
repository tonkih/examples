package ru.ait.example;

import ru.ait.example.fork.Fork;
import ru.ait.example.philosopher.Philosopher;

public class Main {

  public static void main(String[] args) {
    var forks = new Fork[5];
    for (int i = 0; i < forks.length; i++) {
      forks[i] = new Fork(i);
    }

    var philosophers = new Philosopher[5];
    for (int i = 0; i < philosophers.length; i++) {
      var forkNumber = i == forks.length - 1 ? 0 : i + 1;
      philosophers[i] = new Philosopher(i, forks[i], forks[forkNumber]);
      new Thread(philosophers[i]).start();
    }


  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  static class Solution {
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
      int firstInt = convertListNodeToInt(first);
      int secondInt = convertListNodeToInt(second);
      int resultInt = firstInt + secondInt;
      return convertIntToListNode(resultInt);
    }

    private int convertListNodeToInt(ListNode listNode) {
      int i = 1;
      int result = 0;
      while (listNode != null) {
        result += i * listNode.val;
        i *= 10;
        listNode = listNode.next;
      }
      return result;
    }

    private ListNode convertIntToListNode(int value) {
      if (value <= 9) {
        return new ListNode(value);
      }

      int index = 10;
      ListNode listNode = new ListNode();
      insertListNode(listNode, value, index);
      return listNode;
    }

    private void insertListNode(ListNode parent, int value, int index) {
      System.out.println("in value " + value);
      System.out.println("i " + index);
      int remainder = value % index;
      System.out.println("remainder " + remainder);
      parent.val = remainder;

      value -= remainder * (index / 10);
      index *= 10;

      if (value == 0) {
        return;
      }

      ListNode children = new ListNode();
      parent.next = children;

      insertListNode(children, value, index);
    }
  }
}
