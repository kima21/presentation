package com.example.ashley.gamestate.uno;

/**
 * Card Class for Uno
 *
 * @author Andrew, Meredith, Ashley
 * @date October 2018
 */
public class Card {


     // two hand. One card in one hand. Two cards in the other hand. Have one card be played and show
    //that it was added to the discard pile. The discard pile has one more card and the hand now has
    //one less card
    //initialize all the values that are needed for this class
    int value;
    char type;
    int color;
    String id;

    /** Constructor
     *
     */
    public Card() {
        value = 0;
        type = ' ';
        color = 0;
        id = " ";
    }

    /** Deep constructor
     *
     * @param c
     * @param v
     * @param t
     * @param i
     */
    public Card(int c, int v, char t, String i)
    {
        color = c;
        value = v;
        type = ' ';
        id = " ";
    }

    /** Clone method to copy and return new card for deep constructor
     *
     * @return copy of Card class
     */
    public Card clone(){

        return new Card(color, value, type, id);
    }

    //getter and setter methods
    public int getValue() { return value; }

    public char getType() { return type; }

    public int getColor() { return color; }

    public String getId(){ return id; }

    public void setValue(int v) { this.value = v; }

    public void setType(char t) { this.type = t; }

    public void setColor(int c) { this.color = c; }

    public void setId(String i) { this.id = i; }
}