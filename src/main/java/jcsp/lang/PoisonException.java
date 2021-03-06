
//////////////////////////////////////////////////////////////////////
//                                                                  //
//  JCSP ("CSP for Java") Libraries                                 //
//  Copyright (C) 1996-2018 Peter Welch, Paul Austin and Neil Brown //
//                2001-2004 Quickstone Technologies Limited         //
//                2005-2018 Kevin Chalmers                          //
//                                                                  //
//  You may use this work under the terms of either                 //
//  1. The Apache License, Version 2.0                              //
//  2. or (at your option), the GNU Lesser General Public License,  //
//       version 2.1 or greater.                                    //
//                                                                  //
//  Full licence texts are included in the LICENCE file with        //
//  this library.                                                   //
//                                                                  //
//  Author contacts: P.H.Welch@kent.ac.uk K.Chalmers@napier.ac.uk   //
//                                                                  //
//////////////////////////////////////////////////////////////////////

package jcsp.lang;

    /**
 * This exception is thrown when a process tries to use a channel that
 * has been poisoned.
 *
 * @see Poisonable
 */

public class PoisonException extends ChannelDataRejectedException {

  private int strength;

  /**
   * JCSP users should not have to construct these.
   *
   * @param strength the strength of this exception
   *   (which will normally be the strength of the poison in the channel).
   */
  protected PoisonException (int strength) {
    //super("PoisonException, strength: " + strength);
    this.strength = strength;
  }

  /**
   * Once this exception has been caught, the catching process should
   * poison all its channels with the strength held by the exception
   * (which will normally be the strength of the poison in the channel
   * that caused the exception to be thrown).
   * See the example handler at the end of
   * <a href="Alternative.html#FairMuxTime">this section</a>
   * of the documentation of {@link Alternative}.
   */
  public int getStrength() {
    return strength;
   }

}
