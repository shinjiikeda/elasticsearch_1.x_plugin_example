package org.elasticsearch.plugin.example;

import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.index.similarity.SimilarityModule;

import java.util.Collection;


public class ExamplePlugin extends AbstractPlugin {
    @Override public String name() {
        return "example-plugin";
    }

    @Override public String description() {
        return "Example Plugin Description";
    }

    public void onModule(SimilarityModule module){
        module.addSimilarity("similarity", ExampleSimilarityProvider.class);
    }
}
