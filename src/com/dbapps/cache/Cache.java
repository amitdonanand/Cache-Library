package com.dbapps.cache;

import com.dbapps.cache.eviction.EvictionStrategy;
import com.dbapps.cache.storage.StorageProvider;

/**
 * A cache which has key-value pairs of objects<br>
 * 
 * @author Dhwaneet
 * 
 * @param <K>
 *            The key object should have a sufficiently well defined hashCode
 *            function which distributes the object well. The better the
 *            hashCode more will be the speed in the lookups
 * @param <V>
 *            The value object
 */
public class Cache<K, V>
{
    /**
     * Provides storage semantics for storing key-value pairs of data
     */
    private StorageProvider<K, V> storageProvider;

    /**
     * Provides eviction strategy for keys when max size is reached
     */
    private EvictionStrategy<K, V> evictionStrategy;

    /**
     * @param storageProvider
     * @param evictionStrategy
     */
    protected Cache(StorageProvider<K, V> storageProvider, EvictionStrategy<K, V> evictionStrategy)
    {
        this.storageProvider = storageProvider;
        this.evictionStrategy = evictionStrategy;
    }

    /**
     * Get the value associated with the key
     * 
     * @param key
     *            The key object
     * @return The value object<br>
     *         null - if key is expired/not found in the cache
     */
    public V get(K key)
    {
        V out = null;
        // TODO: implement get logic
        return out;
    }
    
    /**
     * Put the key-value pair in the cache
     * @param key The key object
     * @param value The value object
     */
    public void put(K key, V value)
    {
        //TODO: implement put logic
    }

}