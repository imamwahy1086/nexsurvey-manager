package id.nexcloud.nexsurvey.entity.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QproductInStore is a Querydsl query type for productInStore
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QproductInStore extends EntityPathBase<productInStore> {

    private static final long serialVersionUID = 1382918001L;

    public static final QproductInStore productInStore = new QproductInStore("productInStore");

    public final id.nexcloud.nexsurvey.entity.common.QBaseEntity _super = new id.nexcloud.nexsurvey.entity.common.QBaseEntity(this);

    public final NumberPath<Integer> badStock = createNumber("badStock", Integer.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customer_ID = createNumber("customer_ID", Long.class);

    public final NumberPath<Integer> goodStock = createNumber("goodStock", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath isMSl = createString("isMSl");

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> modifiedDate = _super.modifiedDate;

    public final StringPath productCategoryID = createString("productCategoryID");

    public final StringPath productCategoryName = createString("productCategoryName");

    public final StringPath productCode = createString("productCode");

    public final StringPath productGroup1 = createString("productGroup1");

    public final StringPath productGroup1Name = createString("productGroup1Name");

    public final StringPath productGroup2 = createString("productGroup2");

    public final StringPath productGroup2Name = createString("productGroup2Name");

    public final StringPath productGroup3 = createString("productGroup3");

    public final StringPath productGroup3Name = createString("productGroup3Name");

    public final StringPath productName = createString("productName");

    public final StringPath productPackaging = createString("productPackaging");

    public final NumberPath<Double> sellingPrice = createNumber("sellingPrice", Double.class);

    public final StringPath uom1 = createString("uom1");

    public final NumberPath<Integer> uom1Qty = createNumber("uom1Qty", Integer.class);

    public final StringPath uom2 = createString("uom2");

    public final NumberPath<Integer> uom2Qty = createNumber("uom2Qty", Integer.class);

    public final StringPath uom3 = createString("uom3");

    public final NumberPath<Integer> uom3Qty = createNumber("uom3Qty", Integer.class);

    public final StringPath uom4 = createString("uom4");

    public final NumberPath<Integer> uom4Qty = createNumber("uom4Qty", Integer.class);

    public final DateTimePath<java.util.Date> visitDate = createDateTime("visitDate", java.util.Date.class);

    public QproductInStore(String variable) {
        super(productInStore.class, forVariable(variable));
    }

    public QproductInStore(Path<? extends productInStore> path) {
        super(path.getType(), path.getMetadata());
    }

    public QproductInStore(PathMetadata metadata) {
        super(productInStore.class, metadata);
    }

}

