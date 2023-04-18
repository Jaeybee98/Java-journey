#day61 of #100days

Still on Hashing, i learnt about Handling Collisions Using Separate chaining and Load Factor and Rehashing.

-The separate chaining scheme places all entries with the same hash index in the same location, rather than finding new locations. Each location in the separate chaining scheme uses a bucket to hold multiple entries. You can implement a bucket using an array, ArrayList, or LinkedList.

-The load factor measures how full a hash table is. If the load factor is exceeded, increase the hash-table size and reload the entries into a new larger hash table. This is called rehashing. elements to the size of the hash table. 
