/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author root
 */
class DFA3 extends Automaton {

        //deterministic finite automaton for (1+0)*111
    public static enum State1 {
        a, b, c, d
         } //enumerated class

        public Class getStates() {
            return State1.class;
        }

      public State1 delta(State1 q, char c) {
      if (q==State1.a && c=='0') return State1.a;
      if (q==State1.a && c=='1') return State1.b;
      if (q==State1.b && c=='0') return State1.a;
      if (q==State1.b && c=='1') return State1.c;
      if (q==State1.c && c=='0') return State1.a;
      if (q==State1.c && c=='1') return State1.d;
      if (q==State1.d && c=='1') return State1.d;
      if (q==State1.d && c=='0') return State1.a;
      
      return null;  //default is null -- no transition
       } 

        public boolean accept(String w) {
            State1 q = State1.a;  //initial State1
            for (int j = 0; j < w.length(); j++) {
                char c = w.charAt(j);
                State1 t = delta(q, c);

                if (t == null) {
                    return false;
                }
                q = t;
            }
            return (q == State1.d);  //acceptable?
        }

    }