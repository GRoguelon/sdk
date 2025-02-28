//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateRuleInternalServerError {
  /// Returns a new [UpdateRuleInternalServerError] instance.
  UpdateRuleInternalServerError({
    this.payload,
  });

  UpdateRuleInternalServerErrorBody payload;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateRuleInternalServerError &&
     other.payload == payload;

  @override
  int get hashCode =>
    (payload == null ? 0 : payload.hashCode);

  @override
  String toString() => 'UpdateRuleInternalServerError[payload=$payload]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (payload != null) {
      json[r'Payload'] = payload;
    }
    return json;
  }

  /// Returns a new [UpdateRuleInternalServerError] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static UpdateRuleInternalServerError fromJson(Map<String, dynamic> json) => json == null
    ? null
    : UpdateRuleInternalServerError(
        payload: UpdateRuleInternalServerErrorBody.fromJson(json[r'Payload']),
    );

  static List<UpdateRuleInternalServerError> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <UpdateRuleInternalServerError>[]
      : json.map((dynamic value) => UpdateRuleInternalServerError.fromJson(value)).toList(growable: true == growable);

  static Map<String, UpdateRuleInternalServerError> mapFromJson(Map<String, dynamic> json) {
    final map = <String, UpdateRuleInternalServerError>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = UpdateRuleInternalServerError.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of UpdateRuleInternalServerError-objects as value to a dart map
  static Map<String, List<UpdateRuleInternalServerError>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<UpdateRuleInternalServerError>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = UpdateRuleInternalServerError.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

