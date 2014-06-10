package com.dbapps.cache;

import com.dbapps.cache.enums.EvictionTypeEnum;
import com.dbapps.cache.enums.StorageTypeEnum;
import com.dbapps.cache.eviction.EvictionStrategy;
import com.dbapps.cache.eviction.LRUEvictionStrategy;
import com.dbapps.cache.storage.InMemoryStorageProvider;
import com.dbapps.cache.storage.StorageProvider;

/**
 * Factory class providing Cache implementations
 * 
 * @author Dhwaneet
 * 
 */
public class CacheFactory
{
    /**
     * Return the Cache with given storage semantics and eviction strategy
     * 
     * @param storageTypeEnum
     *            Storage semantics
     * @param evictionTypeEnum
     *            Eviction strategy
     * @param ttlInSec
     *            Time (in seconds) after which key expires
     * @param maxCacheSize
     *            Max size of cache after which keys are evicted according to
     *            eviction strategy
     * @return {@link Cache}
     */
    public static <K, V> Cache<K, V> getCache(StorageTypeEnum storageTypeEnum,
                                              EvictionTypeEnum evictionTypeEnum, Long ttlInSec,
                                              Long maxCacheSize)
    {
        StorageProvider<K, V> storageProvider = getStorageProvider(storageTypeEnum);
        EvictionStrategy<K, V> evictionStrategy =
            getEvictionStrategy(evictionTypeEnum, ttlInSec, maxCacheSize);
        Cache<K, V> out = new Cache<>(storageProvider, evictionStrategy);
        return out;
    }

    /**
     * Factory method for StorageProvider
     * @param storageTypeEnum
     * @return {@link StorageProvider}
     */
    private static <K, V> StorageProvider<K, V> getStorageProvider(StorageTypeEnum storageTypeEnum)
    {
        StorageProvider<K, V> out = null;
        switch (storageTypeEnum)
        {
            case IN_MEMORY:
            {
                out = new InMemoryStorageProvider<K, V>();
            }
            break;
            case FILE:
            {
                out = null;
            }
            break;
        }
        return out;
    }

    /**
     * Factory method for EvictionStrategy
     * @param evictionTypeEnum
     * @param ttlInSec
     * @param maxCacheSize
     * @return {@link EvictionStrategy}
     */
    private static <K, V> EvictionStrategy<K, V>
        getEvictionStrategy(EvictionTypeEnum evictionTypeEnum, Long ttlInSec, Long maxCacheSize)
    {
        EvictionStrategy<K, V> out = null;
        switch (evictionTypeEnum)
        {
            case LRU:
            {
                out = new LRUEvictionStrategy<K, V>(ttlInSec, maxCacheSize);
            }
            break;
            case FCFS:
            {
                out = null;
            }
            break;
        }
        return out;
    }

}