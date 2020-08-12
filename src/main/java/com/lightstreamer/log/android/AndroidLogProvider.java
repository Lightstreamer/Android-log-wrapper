/*
 * Copyright (c) 2004-2015 Weswit s.r.l., Via Campanini, 6 - 20124 Milano, Italy.
 * All rights reserved.
 * www.lightstreamer.com
 *
 * This software is the confidential and proprietary information of
 * Weswit s.r.l.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered
 * into with Weswit s.r.l.
 */
package com.lightstreamer.log.android;

import android.util.Log;

import com.lightstreamer.log.Logger;
import com.lightstreamer.log.LoggerProvider;

/**
 * 
 */
public class AndroidLogProvider implements LoggerProvider {

  
  @Override
  public Logger getLogger(String category) {
    return new AndroidLogger(category);
  }
  
  private class AndroidLogger implements Logger {
   
    private String tag;
  
    AndroidLogger(String category) {
      this.tag = category;
    }
  
    @Override
    public void error(String line) {
      Log.e(this.tag, line);
    }
  
    @Override
    public void error(String line, Throwable exception) {
      Log.e(this.tag, line, exception);
    }
  
    @Override
    public void warn(String line) {
      Log.w(this.tag, line);
    }
  
    @Override
    public void warn(String line, Throwable exception) {
      Log.w(this.tag, line, exception);
    }
  
    @Override
    public void info(String line) {
      Log.i(this.tag, line);
    }
  
    @Override
    public void info(String line, Throwable exception) {
      Log.i(this.tag, line, exception);
    }
  
    @Override
    public void debug(String line) {
      Log.d(this.tag, line);
    }
  
    @Override
    public void debug(String line, Throwable exception) {
      Log.d(this.tag, line, exception);
    }
  
    @Override
    public void fatal(String line) {
      Log.e(this.tag, line);
    }
  
    @Override
    public void fatal(String line, Throwable exception) {
      Log.e(this.tag, line, exception);
    }
  
    @Override
    public boolean isDebugEnabled() {
      return true;
    }
  
    @Override
    public boolean isInfoEnabled() {
      return true;
    }
  
    @Override
    public boolean isWarnEnabled() {
      return true;
    }
  
    @Override
    public boolean isErrorEnabled() {
      return true;
    }
  
    @Override
    public boolean isFatalEnabled() {
      return true;
    }
      
  }

}
