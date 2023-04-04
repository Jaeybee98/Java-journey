#day47 of #100days

I learnt about Maps today.

-A map is a container object that stores a collection of key/value pairs. It enables fast retrieval, deletion, and updating of the pair through the key. A map stores the values along with the keys. The keys are like indexes.

-In List, the indexes are integers. In Map, the keys can be any objects. A map cannot contain duplicate keys. Each key maps to one value. A key and its corresponding value form an entry stored in a map. There are three types of maps: HashMap, LinkedHashMap, and TreeMap. The common features of these maps are defined in the Map interface. 

-The HashMap class is efficient for locating a value, inserting an entry, and deleting an entry. LinkedHashMap extends HashMap with a linked-list implementation that supports an ordering of the entries in the map. The entries in a HashMap are not ordered, but the entries in a LinkedHashMap can be retrieved either in the order in which they were inserted into the map (known as the insertion order) or in the order in which they were last accessed, from least recently to most recently accessed (access order). The TreeMap class is efficient for traversing the keys in a sorted order.
