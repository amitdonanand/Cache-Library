package com.dbapps.cache.enums;

/**
 * Options for key eviction techniques
 * @author Dhwaneet
 *
 */
public enum EvictionTypeEnum
{
    /**
     * The key least recently used is eligible to be evicted
     */
    LRU,
    /**
     * The key stored at eldest time is eligible to be evicted
     */
    FCFS
}
