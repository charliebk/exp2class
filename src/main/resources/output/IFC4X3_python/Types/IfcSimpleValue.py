# SELECT TYPE IfcSimpleValue
# Options:
# - IfcBinary
# - IfcBoolean
# - IfcDate
# - IfcDateTime
# - IfcDuration
# - IfcIdentifier
# - IfcInteger
# - IfcLabel
# - IfcLogical
# - IfcPositiveInteger
# - IfcReal
# - IfcText
# - IfcTime
# - IfcTimeStamp
# - IfcURIReference
class IfcSimpleValue:
    def __init__(self, value):
        if not isinstance(value, (IfcBinary, IfcBoolean, IfcDate, IfcDateTime, IfcDuration, IfcIdentifier, IfcInteger, IfcLabel, IfcLogical, IfcPositiveInteger, IfcReal, IfcText, IfcTime, IfcTimeStamp, IfcURIReference)):
            raise TypeError("value must be one of: IfcBinary, IfcBoolean, IfcDate, IfcDateTime, IfcDuration, IfcIdentifier, IfcInteger, IfcLabel, IfcLogical, IfcPositiveInteger, IfcReal, IfcText, IfcTime, IfcTimeStamp, IfcURIReference")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
