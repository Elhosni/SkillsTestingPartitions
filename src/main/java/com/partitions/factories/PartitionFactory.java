package com.partitions.factories;

import com.partitions.impl.PartitionImpl;

public class PartitionFactory {
	
    private PartitionFactory() {

    }

    /**
     * Creates an instance of {@link StringPadder}.
     *
     * @return the new instance
     */
    public static PartitionImpl createPartitionFactory() {
        return new PartitionImpl();
    }

}
