package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelSequence extends IfcRelConnects {

    public IfcProcess RelatingProcess;
    public IfcProcess RelatedProcess;
    public IfcLagTime TimeLag; // OPTIONAL
    public IfcSequenceEnum SequenceType; // OPTIONAL
    public IfcLabel UserDefinedSequenceType; // OPTIONAL
    // INVERSE attributes:
    // AvoidInconsistentSequence : RelatingProcess :<>: RelatedProcess;
    // CorrectSequenceType : (SequenceType <> IfcSequenceEnum.USERDEFINED) OR ((SequenceType = IfcSequenceEnum.USERDEFINED) AND EXISTS(UserDefinedSequenceType));

    // WHERE constraints:
    // AvoidInconsistentSequence : RelatingProcess :<>: RelatedProcess;
    // CorrectSequenceType : (SequenceType <> IfcSequenceEnum.USERDEFINED) OR ((SequenceType = IfcSequenceEnum.USERDEFINED) AND EXISTS(UserDefinedSequenceType));
}
