package com.outr.scribe

/**
  * Logging is a mix-in to conveniently add logging support to any class or object.
  */
trait Logging {
  /**
    * Override this to change the name of the underlying logger.
    *
    * Defaults to class name with package
    */
  protected def loggerName = getClass.getName
}
