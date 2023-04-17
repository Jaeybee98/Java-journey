#day60 of #100days

I continued learning about Hashings. I learnt about Hash codes for Primitive Types and Strings.

-Compressing Hash Codes:The hash code for a key can be a large integer that is out of the range for the hash-table index, so you need to scale it down to fit in the index’s range. Assume the index for a hash table is between 0 and N-1. The most common way to scale an integer to between 0 and N-1 is to use 'h(hashCode) = hashCode % N'

-Handling Collisions Using Open Addressing: A collision occurs when two keys are mapped to the same index in a hash table. Generally, there are two ways for handling collisions: open addressing and separate chaining.
Open addressing is the process of finding an open location in the hash table in the event of a collision. Open addressing has several variations: linear probing, quadratic probing, and double hashing.
