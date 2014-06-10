package com.dbapps.cache.eviction;

/**
 * Eviction Strategy provides various eviction strategies for keys in a Cache
 * 
 * @author Dhwaneet
 * 
 * @param <K>
 *            The key object
 * @param <V>
 *            The value object
 */
public abstract class EvictionStrategy<K, V>
{
    /**
     * Time To Live, key expires after this specified time (in seconds)
     */
    protected Long ttlInSec;
    
    /**
     * Keys are evicted after cache size hits this specified size
     */
    private Long maxCacheSize;

    /**
     * @param ttlInSec
     * @param maxCacheSize
     */
    public EvictionStrategy(Long ttlInSec, Long maxCacheSize)
    {
        this.ttlInSec = ttlInSec;
        this.maxCacheSize = maxCacheSize;
    }

    /**
     * Checks whether key has been expired
     * 
     * @param key
     * @return false - if key is valid<br>
     *         true - otherwise
     */
    public abstract boolean isExpired(K key);

    /**
     * Register the get operation for the key
     * @param key
     */
    public abstract void registerGet(K key);

    /**
     * Register the put operation for the key
     * @param key
     */
    public abstract void registerPut(K key);
    
    /**
     * Cleans the cache by evicting candidate keys
     */
    public abstract void clean();
}