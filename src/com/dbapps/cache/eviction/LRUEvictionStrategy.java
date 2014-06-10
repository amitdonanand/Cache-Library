package com.dbapps.cache.eviction;

/**
 * Provides LRU eviction strategy for keys<br>
 * Semantics:<br>
 * 1. Update the reference count of the key when its get operation is registered<br>
 * 2. Evict only those expired keys with least reference count<br>
 * 
 * @author Dhwaneet
 * 
 * @param <K>
 *            The key object
 * @param <V>
 *            The value object
 */
public class LRUEvictionStrategy<K, V> extends EvictionStrategy<K, V>
{
    /**
     * @param ttlInSec
     * @param maxCacheSize
     */
    public LRUEvictionStrategy(Long ttlInSec, Long maxCacheSize)
    {
        super(ttlInSec, maxCacheSize);
    }

    @Override
    public boolean isExpired(K key)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void registerGet(K key)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerPut(K key)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void clean()
    {
        // TODO Auto-generated method stub

    }

}