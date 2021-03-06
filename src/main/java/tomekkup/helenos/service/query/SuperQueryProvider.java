package tomekkup.helenos.service.query;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import java.util.List;
import tomekkup.helenos.types.Slice;
import tomekkup.helenos.types.qx.query.QxSubPredicateQuery;
import tomekkup.helenos.types.qx.query.QxSubRangeQuery;

/**
 * ********************************************************
 * Copyright: 2012 Tomek Kuprowski
 *
 * License: GPLv2: http://www.gnu.org/licences/gpl.html
 *
 * @author Tomek Kuprowski (tomekkuprowski at gmail dot com)
 * *******************************************************
 */
public interface SuperQueryProvider {

    <K, SN, N, V> List<Slice<K, N, V>> predicate(@JsonRpcParam("query") QxSubPredicateQuery<K,SN,N,V> query);

    <K, SN, N, V> List<Slice<K, N, V>> keyRange(@JsonRpcParam("query") QxSubRangeQuery<K,SN,N,V> query);
}
