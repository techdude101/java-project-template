#!/usr/bin/env bash

MAIN_ISSUES_REPORT=$(find . -type f -name 'main.xml');
TEST_ISSUES_REPORT=$(find . -type f -name 'test.xml');

MAIN_ISSUE_COUNT=$((MAIN_ISSUE_COUNT + $(grep -o '<error' "$MAIN_ISSUES_REPORT" | wc -l)));
TEST_ISSUE_COUNT=$((TEST_ISSUE_COUNT + $(grep -o '<error' "$TEST_ISSUES_REPORT" | wc -l)));

if [ "$MAIN_ISSUE_COUNT" -gt 0 ] || [ "$TEST_ISSUE_COUNT" -gt 0 ];
then
  echo "Total number of issues: $(("$MAIN_ISSUE_COUNT" + "$TEST_ISSUE_COUNT"))"
  echo "Number of issues (main): $MAIN_ISSUE_COUNT"
  echo "Number of issues (test): $TEST_ISSUE_COUNT"
  exit 1;
fi