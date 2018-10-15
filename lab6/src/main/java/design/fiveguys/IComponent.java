package design.fiveguys;

import java.util.ArrayList;

/**
 * 
 * Burger Component Interface
 */
public interface IComponent extends Cloneable{

  /**
   * Get component description	
   * @return component description
   */
  String description();
  
  /**
   * add child component 
   * @param c  child component to add
   */
  void addChild(IComponent c);
  
  /**
   * remove child component
   * @param c child component to remove
   */
  void removeChild(IComponent c);
  
  /**
   * Get child component via index
   * @param index  the index of child component to get
   * @return child component
   */
  IComponent getChild(int index);
  
  /**
   * Print component description	
   */
  void print();
 
  /**
   * set print Receipt strategy
   */
  void setReceiptStrategy();

  /**
   * set print Pack strategy
   */
  void setPackStrategy();
  
  /**
   * Get Component Price
   * @return the component price
   */
  float getPrice();
  
  
  IComponent clone() throws CloneNotSupportedException;
  
	/**
	 * The total child components
	 */
int count();

/**
 * Get child component via index
 * @param index  the index of child component to get
 * @return child component
 */
 ArrayList<IComponent> components();
  
}
