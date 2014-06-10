package com.dbapps.cache.storage;

import java.util.Collection;

/**
 * Storage provider provides store and retrive functionality from internal
 * storage mechanism
 * 
 * @author Dhwaneet
 * 
 * @param <K>
 *            The key object
 * @param <V>
 *            The value object
 */
public abstract class StorageProvider<K, V>
{
    /**
     * Retrieve the value
     * 
     * @param key
     * @return value
     */
    public abstract V retrieve(K key);

    /**
     * Store the value at key
     * 
     * @param key
     * @param value
     */
    public abstract void store(K key, V value);

    /**
     * Get all keys in the storage
     * 
     * @return Collection of all keys
     */
    public abstract Collection<K> getAllKeys();

    /**
     * Delete associated entry with the key
     * 
     * @param key
     * @return deleted value
     */
    public abstract V remove(K key);
}