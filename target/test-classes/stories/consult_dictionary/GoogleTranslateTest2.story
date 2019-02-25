Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Meta:
@debug

Lifecycle:
Before:
Given the user is on the google translate page 'English' 'Ukrainian'

When the user looks up the translation of the word 'apple'

Then verify count of character