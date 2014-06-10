package com.dbapps.cache.storage;

import java.util.Collection;

/**
 * InMemoryStorageProvider uses simple HashMap based storage facility
 * 
 * @author Dhwaneet
 * 
 * @param <K>
 * @param <V>
 */
public class InMemoryStorageProvider<K, V> extends StorageProvider<K, V>
{
    @Override
    public V retrieve(K key)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void store(K key, V value)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public Collection<K> getAllKeys()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V remove(K key)
    {
        // TODO Auto-generated method stub
        return null;
    }
}