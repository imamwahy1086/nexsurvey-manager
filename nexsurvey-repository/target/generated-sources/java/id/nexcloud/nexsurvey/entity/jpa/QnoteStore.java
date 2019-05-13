package id.nexcloud.nexsurvey.entity.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QnoteStore is a Querydsl query type for noteStore
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QnoteStore extends EntityPathBase<noteStore> {

    private static final long serialVersionUID = 651042027L;

    public static final QnoteStore noteStore = new QnoteStore("noteStore");

    public final id.nexcloud.nexsurvey.entity.common.QBaseEntity _super = new id.nexcloud.nexsurvey.entity.common.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customer_ID = createNumber("customer_ID", Long.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> modifiedDate = _super.modifiedDate;

    public final StringPath noteCategory = createString("noteCategory");

    public final StringPath noteDescription = createString("noteDescription");

    public final DateTimePath<java.util.Date> visitDate = createDateTime("visitDate", java.util.Date.class);

    public QnoteStore(String variable) {
        super(noteStore.class, forVariable(variable));
    }

    public QnoteStore(Path<? extends noteStore> path) {
        super(path.getType(), path.getMetadata());
    }

    public QnoteStore(PathMetadata metadata) {
        super(noteStore.class, metadata);
    }

}

