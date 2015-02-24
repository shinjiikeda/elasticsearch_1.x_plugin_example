package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

public class ExampleSimilarityProvider extends AbstractSimilarityProvider {

    private final ExampleSimilarity similarity;

    @Inject
    public ExampleSimilarityProvider( @Assisted String name, @Assisted Settings settings) {
    super(name);
    this.similarity = new ExampleSimilarity();
    }

    public ExampleSimilarity get() {
    return similarity;
    }
}
