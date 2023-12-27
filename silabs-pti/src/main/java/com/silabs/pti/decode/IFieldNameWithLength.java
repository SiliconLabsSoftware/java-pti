/*******************************************************************************
 * # License
 * Copyright 2021 Silicon Laboratories Inc. www.silabs.com
 *******************************************************************************
 *
 * The licensor of this software is Silicon Laboratories Inc. Your use of this
 * software is governed by the terms of Silicon Labs Master Software License
 * Agreement (MSLA) available at
 * www.silabs.com/about-us/legal/master-software-license-agreement. This
 * software is distributed to you in Source Code format and is governed by the
 * sections of the MSLA applicable to Source Code.
 *
 ******************************************************************************/

package com.silabs.pti.decode;

/**
 * Interface that extends field name with length.
 *
 * @author timotej Created on May 25, 2021
 */
public interface IFieldNameWithLength extends IFieldName {

  /**
   * Length of a given field. -1 means variable.
   * 
   * @return The length in bytes.
   */
  public int length();
}
