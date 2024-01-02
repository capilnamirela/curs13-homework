package org.fasttrackit;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data

public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favourite;
}
