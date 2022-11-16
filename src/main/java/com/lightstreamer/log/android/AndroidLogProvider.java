/*
 *  Copyright (c) Lightstreamer Srl
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      https://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
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
