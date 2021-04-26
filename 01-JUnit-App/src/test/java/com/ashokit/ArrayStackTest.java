package com.ashokit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

class ArrayStackTest {

   @Test
   public void pushThenPeek_Add1_ShouldBeAtTopOfStack() {
	  StackInterface<Integer>  stack = new ArrayStack<Integer>();
       int item = 5;

       stack.push(item);

       assertEquals(item, stack.peek());
   }

   @Test
   public void pushThenPeek_AddSeveral_ShouldHaveLastAddedAtTopOfStack() {
		  StackInterface<String> stack = new ArrayStack<String>();
        Object bestLanguages = List.of("C", "C++", "Java", "Javascript", "Haskell");

       bestLanguages.forEach((x) -> stack.push(x));

       assertEquals(Utils.getLast(bestLanguages), stack.peek());
   }

   @Test
   public void pushThenPop_Add1AndPop_ShouldPopOffAddedItem() {
       var stack = new ArrayStack<Integer>();
       var item = 5;

       stack.push(item);
       var popped = stack.pop();

       assertEquals(item, popped);
   }

   @Test
   public void pushThenPop_AddSeveralAndPopSeveral_ShouldPopInExceptedOrder() {
       var stack = new ArrayStack<String>();
       var bestLanguages = List.of("C", "C++", "Java", "Javascript", "Haskell");
       var expectedPopOrder = Utils.reverse(bestLanguages);

       bestLanguages.forEach((x) -> stack.push(x));

       expectedPopOrder.forEach((x) -> assertEquals(x, stack.pop()));
   }

   @Test
   public void empty_IsEmptyStack_ShouldReturnTrue() {
       var stack = new ArrayStack<String>();
       assertTrue(stack.empty());
   }

   @Test
   public void pushThenEmpty_IsNotEmpty_ShouldReturnFalse() {
       var stack = new ArrayStack<String>();
       var bestLanguages = List.of("C", "C++", "Java", "Javascript", "Haskell");

       bestLanguages.forEach((x) -> stack.push(x));

       assertFalse(stack.empty());
   }

   @Test
   public void pushThenSeek_ItemLies3PopsAway_ShouldReturnDistanceFromTop() {
       var stack = new ArrayStack<String>();
       var correctStack = new Stack<String>();
       var bestLanguages = List.of("C", "C++", "Java", "Javascript", "Haskell");

       bestLanguages.forEach((x) -> stack.push(x));
       bestLanguages.forEach((x) -> correctStack.push(x));

       assertEquals(correctStack.search("Java"), stack.search("Java"));
   }

   @Test
   public void pushThenSeek_ItemNotInStack_ShouldReturnMinus1() {
       var stack = new ArrayStack<String>();
       var bestLanguages = List.of("C", "C++", "Java", "Javascript", "Haskell");
       var expectedDistance = -1;

       bestLanguages.forEach((x) -> stack.push(x));

       var distanceToTop = stack.search("Ada");

       assertEquals(expectedDistance, distanceToTop);
   }

   @Test
   public void peek_StackIsEmpty_ShouldThrowStackException() {
       var stack = new ArrayStack<String>();

       assertThrows(EmptyStackException.class, () -> stack.peek());
   }

   @Test
   public void pop_StackIsEmpty_ShouldThrowStackException() {
       var stack = new ArrayStack<String>();

       assertThrows(EmptyStackException.class, () -> stack.pop());
   }

   @Test
   public void push_PushOverStorageAmount_ShouldThrowStackOverflowException() {
       var stack = new ArrayStack<Integer>();
       assertThrows(StackOverflowError.class, () -> {
           for (int i = 0; i < 250; i++)
               stack.push(i);
       });
   }
}