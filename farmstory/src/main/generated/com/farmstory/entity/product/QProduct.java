package com.farmstory.entity.product;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = 226693601L;

    public static final QProduct product = new QProduct("product");

    public final NumberPath<Integer> deliveryfee = createNumber("deliveryfee", Integer.class);

    public final NumberPath<Integer> discount = createNumber("discount", Integer.class);

    public final StringPath etc = createString("etc");

    public final StringPath img1 = createString("img1");

    public final StringPath img2 = createString("img2");

    public final StringPath img3 = createString("img3");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath prodName = createString("prodName");

    public final NumberPath<Integer> prodNo = createNumber("prodNo", Integer.class);

    public final StringPath regdate = createString("regdate");

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    public final StringPath type = createString("type");

    public final StringPath uid = createString("uid");

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

