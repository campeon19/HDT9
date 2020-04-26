/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfredo
 * @param <Key>
 * @param <Value>
 */
public interface BSTBalance<Key extends Comparable<Key>, Value> {
    public void put(Key key, Value value);
    public Value get(Key key);
    public boolean contains(Key key);
    public int size();
    public int compareTo(Key key);
}
