package id.nexcloud.nexsurvey.entity.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseTreeEntity is a Querydsl query type for BaseTreeEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBaseTreeEntity extends EntityPathBase<BaseTreeEntity<?, ? extends java.io.Serializable>> {

    private static final long serialVersionUID = 1068765572L;

    public static final QBaseTreeEntity baseTreeEntity = new QBaseTreeEntity("baseTreeEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> modifiedDate = _super.modifiedDate;

    public final SimplePath<Object> parent = createSimple("parent", Object.class);

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseTreeEntity(String variable) {
        super((Class) BaseTreeEntity.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseTreeEntity(Path<? extends BaseTreeEntity> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseTreeEntity(PathMetadata metadata) {
        super((Class) BaseTreeEntity.class, metadata);
    }

}

