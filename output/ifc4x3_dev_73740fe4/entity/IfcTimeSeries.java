package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcTimeSeries {

    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    public IfcDateTime StartTime;
    public IfcDateTime EndTime;
    public IfcTimeSeriesDataTypeEnum TimeSeriesDataType;
    public IfcDataOriginEnum DataOrigin;
    public IfcLabel UserDefinedDataOrigin; // OPTIONAL
    public IfcUnit Unit; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReference : SET [1:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;

    // SUPERTYPE OF:
    // - IfcIrregularTimeSeries
    // - IfcRegularTimeSeries
}
