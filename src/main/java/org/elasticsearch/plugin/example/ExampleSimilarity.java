package org.elasticsearch.plugin.example;

import java.io.IOException;

import org.apache.lucene.index.AtomicReaderContext;
import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.index.NumericDocValues;
import org.apache.lucene.search.CollectionStatistics;
import org.apache.lucene.search.Explanation;
import org.apache.lucene.search.TermStatistics;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.search.similarities.DefaultSimilarity;

public class ExampleSimilarity extends DefaultSimilarity {

    public ExampleSimilarity() {
    super();
    }

    @Override
    public float tf(float freq){
    return 1.0f;
    }

    @Override
    public float idf(long docFreq, long numDocs){
        return 1.0f;
    }
}
