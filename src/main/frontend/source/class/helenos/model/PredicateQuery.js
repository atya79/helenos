/* ************************************************************************
Copyright:
  2012 Tomek Kuprowski
License:
  GPLv2: http://www.gnu.org/licences/gpl.html
Authors:
  Tomek Kuprowski (tomekkuprowski at gmail dot com)
 ************************************************************************ */
qx.Class.define('helenos.model.PredicateQuery',
{
    extend : helenos.model.AbstractColumnQuery,
    
    construct : function()
    {
        this.base(arguments);
    },

    properties :
    {
        key : {
            nullable : false
        }
    }
});