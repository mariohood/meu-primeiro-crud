package br.com.mariohood;

import org.junit.Assert;
import org.junit.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;


@QuarkusTest
@QuarkusTestResource(DatabaseLifecycle.class)
public class ProdutoTest {

    @Test
    public void testUm (){
        Assert.assertEquals(1, Produto.count());
        
    }
    
}
